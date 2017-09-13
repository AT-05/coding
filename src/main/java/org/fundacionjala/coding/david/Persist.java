/**
 * Created by Maizman on 12/09/2017.
 */
public class Persist {


    public static int persistence(Integer number) {
        String[] list = number.toString().split("");
        int count = 0;
        boolean band = true;
        while (band) {
            Integer result = 1;
            if (list.length > 1) {
                for (String item : list) {
                    result = result * Integer.parseInt(item);
                }
                count++;
                list = result.toString().split("");
                band = (result < 10) ? false : true;

            } else {
                band = false;
            }
        }

        return count;
    }
}
