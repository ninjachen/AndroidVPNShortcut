package rocks.ninjachen.vpnshortcut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String ACTION_VPN_SETTINGS =
            "android.net.vpn.SETTINGS";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(ACTION_VPN_SETTINGS);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        if(intent.resolveActivity(getPackageManager())==null){
            Toast.makeText(this, "can not open vpn settings", Toast.LENGTH_SHORT).show();
        }else {
            startActivity(intent);
        }
        finish();
    }
}
