public class Main {
    public static void main(String[] args) {
        int temperature = 35;
        int numberOfStudent = 25;
        boolean isRaine = true;

        if (temperature > 20 && temperature < 40){ // оператор И - && - (and)
            System.out.println("Have a good walk");
        }

        if (temperature > 25 || numberOfStudent > 10){ // оператор ИЛИ - || - (or)
            System.out.println("Go to a picnic");
        }

        if (isRaine || temperature < 10 && numberOfStudent < 5) {
            // true || false && false => 1 + 0 * 0 => 1 + 0 => (True)
            System.out.println("Stay at home");
        }

        if ((isRaine || temperature < 10) && numberOfStudent < 5) {
            // (true || false) && false => (1 + 0) * 0 => 1 * 0 => (False)
            System.out.println("Go to school");
        }

        if (isRaine){
            System.out.println("Take an umbrella");
        }

        if (!isRaine){ // ! - ператор отрицания (Not)
            System.out.println("Turn off dvorniki");
        }

        if (!(isRaine || temperature < 10) && numberOfStudent < 5) {
            // !(true || false) && false => !(1 + 0) * 0 => 0 * 0 => (False)
            System.out.println("Go to the park");
    }
}