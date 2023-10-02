public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("debbie", 14);
        debbie.greeting("Joe");
        debbie.weather();
        System.out.println("Your total length in meters is: " + debbie.convertFeetToMeters(12));
        debbie.favoriteNumber(15);
        System.out.println("The sum of your numbers is: " + debbie.addNumbers(18, 13, 22));
        System.out.println("Your temperature in celcius is: " + debbie.fahrenheitToCelcius(82));
        debbie.digitsOfPi(47);
        System.out.println(debbie.goodbye());
    }
}
