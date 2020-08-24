/**
 * @ProjectName: cloud2020
 * @Package: PACKAGE_NAME
 * @ClassName: T2
 * @Author: 李甫圳
 * @Date: 2020/8/24 13:43
 * @Version: 1.0
 */

import java.time.ZonedDateTime;

/**
 * <p>T2 TODO</p>
 *
 * @author lfz
 * @date 2020/8/24 13:43
 * @version
 **/
public class T2 {
    public static void main(String[] args) {
        //2020-08-24T13:43:52.067+08:00[Asia/Shanghai]
        ZonedDateTime zbj= ZonedDateTime.now();
        System.out.println(zbj);
    }
}
