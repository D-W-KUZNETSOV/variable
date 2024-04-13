public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper =763789;
        System.out.println(paper);
        dog = dog +4;
        System.out.println(dog);
        cat = cat +4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper -7639;
        System.out.println(paper);

        var friend =19;
        System.out.println(friend);
        friend= friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var result = boxer1 + boxer2 ;
        System.out.println("общий вес боксёров = " + result +"кг.");
        var result1 = boxer2 - boxer1;
        System.out.println(" разница в весе боксёров = " + result1 +"кг.");

        var weight1 = 78.2;
        var weight2 = 82.7;
        var remains = weight2 % weight1;
        System.out.println("остаток от деления = "+ remains +"кг.");

        var total = 640;
        var one = 8;
        var result2 = total/one;
        System.out.println("всего  работников в компании  = "+result2 +"человек");

        var result3 = result2 + 94;
        var result4 = result3 * 8;
        System.out.println("Если в компании работает = "+ result3 +"человека,то всего = "+result4 + "часов работы может быть поделено между сотрудниками");







    }

}
