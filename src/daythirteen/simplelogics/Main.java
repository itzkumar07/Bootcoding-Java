package daythirteen.simplelogics;


class Main{
    public static void main(String [] args){



        int result = SaticCalculator.add(4,6);
        System.out.println(result);

        StaticOuter.Inner inner = new StaticOuter.Inner();
        inner.display();

        StaticOuter.Inner inner1 = new StaticOuter.Inner();
        inner1.display();

    }
}
