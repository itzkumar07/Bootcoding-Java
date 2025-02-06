const taskForm = document.getElementById('taskForm');
const taskInput = document.getElementById('taskInput');
const prioritySelect = document.getElementById('prioritySelect');
const taskList = document.getElementById('taskList');

// Array to hold tasks
let tasks = [];
// Track which task is being edited (-1 means no active edit)
let editingTaskIndex = -1;

// Render the tasks dynamically
function renderTasks() {
  taskList.innerHTML = '';
  tasks.forEach((task, index) => {
    const li = document.createElement('li');
    const taskDiv = document.createElement('div');
    taskDiv.className = 'task';

    // If editing, show an input field; otherwise, display the task
    if (editingTaskIndex === index) {
      const editInput = document.createElement('input');
      editInput.type = 'text';
      editInput.value = task.description;
      taskDiv.appendChild(editInput);
    } else {
      taskDiv.innerHTML = `<strong>${task.description}</strong> <em>(${task.priority})</em>`;
    }
    li.appendChild(taskDiv);

    // Create the action buttons container
    const actionsDiv = document.createElement('div');
    actionsDiv.className = 'actions';

    // If editing, show Save and Cancel buttons; otherwise, show Edit and Delete buttons
    if (editingTaskIndex === index) {
      const saveBtn = document.createElement('button');
      saveBtn.className = 'save';
      saveBtn.textContent = 'Save';
      saveBtn.onclick = () => {
        const newDescription = taskDiv.querySelector('input').value;
        if (newDescription.trim()) {
          tasks[index].description = newDescription;
          editingTaskIndex = -1;
          renderTasks();
        }
      };
      actionsDiv.appendChild(saveBtn);

      const cancelBtn = document.createElement('button');
      cancelBtn.className = 'cancel';
      cancelBtn.textContent = 'Cancel';
      cancelBtn.onclick = () => {
        editingTaskIndex = -1;
        renderTasks();
      };
      actionsDiv.appendChild(cancelBtn);
    } else {
      const editBtn = document.createElement('button');
      editBtn.className = 'edit';
      editBtn.textContent = 'Edit';
      editBtn.onclick = () => {
        editingTaskIndex = index;
        renderTasks();
      };
      actionsDiv.appendChild(editBtn);

      const deleteBtn = document.createElement('button');
      deleteBtn.className = 'delete';
      deleteBtn.textContent = 'Delete';
      deleteBtn.onclick = () => {
        tasks.splice(index, 1);
        renderTasks();
      };
      actionsDiv.appendChild(deleteBtn);
    }
    li.appendChild(actionsDiv);
    taskList.appendChild(li);
  });
}

// Handle form submission to add or update a task
taskForm.addEventListener('submit', (e) => {
  e.preventDefault();
  const newTask = {
    description: taskInput.value,
    priority: prioritySelect.value
  };
  // If editing, update the task; otherwise, add a new task
  if (editingTaskIndex > -1) {
    tasks[editingTaskIndex] = newTask;
    editingTaskIndex = -1;
  } else {
    tasks.push(newTask);
  }
  taskInput.value = '';
  renderTasks();
});

// Initial render call
renderTasks();
