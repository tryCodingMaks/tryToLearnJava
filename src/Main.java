public class Main {
    public static char changeCase(char input) {
        if(Character.isLowerCase(input)){
            input = Character.toUpperCase(input);
        }else{
            input = Character.toLowerCase(input);
        }
        return input;
    }

    private Main() {

    }

    public static void main(String[] args) {
        System.out.println(
                "Ввод G в верхнем регистре, должны получить в нижнем: " +
                        changeCase('G')
        );
        System.out.println(
                "Ввод g в нижнем регистре, должны получить в верхнем: " +
                        changeCase('g')
        );
    }
}