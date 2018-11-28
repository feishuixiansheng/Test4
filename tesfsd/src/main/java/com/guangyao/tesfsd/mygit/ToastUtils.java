package com.guangyao.tesfsd.mygit;

import android.content.Context;
import android.widget.Toast;


/**
 * @author zjy
 * @date 2016/12/27
 */
public class ToastUtils {

    //todo sddfafdasffdsf
    /**
     * sdfdsfsdfsadffsdf
     */

    private static Toast toast ;

    public static void showToast(Context context, String content) {
        if (toast == null) {
            toast = Toast.makeText(context, content, Toast.LENGTH_SHORT);
        } else {
            toast.setText(content);
            toast.setDuration(Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}
