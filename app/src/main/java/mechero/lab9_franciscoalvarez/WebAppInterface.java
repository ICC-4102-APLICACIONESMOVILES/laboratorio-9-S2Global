package mechero.lab9_franciscoalvarez;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    Context mContext;

    WebAppInterface(Context c){
        mContext = c;
    }

    @JavascriptInterface
    public void finishActivity(){
        ((Activity)mContext).finish();
    }
}
