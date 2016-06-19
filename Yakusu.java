
package yakusu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author YuFukuda
 */
public class Yakusu {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        String strX = "";

        System.out.println("約数足します！数値を入れてください: ");
        strX = buf.readLine();
        if (strX.matches("^[0-9]+$")) {
            x = Integer.parseInt(strX);

            if (x < 0) {
                System.out.println("正の整数の入力をお願いします。\n 入力された値: " + x);
            } else {
                int i = 1;
                int yakusuAdded = 0;

                System.out.print(x + "の約数は");
                while (i <= x) {
                    if (x % i == 0) {
                        yakusuAdded = yakusuAdded + i;
                        System.out.print(i + ",");
                        i++;
                    } else {
                        i++;
                    }
                }
                // 負の約数は考えてないです。
                System.out.println("\n" + x + "の正の約数を足した値は" + yakusuAdded);
            }

        } else {
            System.out.println("不正な値です: " + strX);
        }
    }
}
