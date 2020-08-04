package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView text;
    String txt = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    
    public void Copy(View view)
    {
        if(text != null)
        {
            txt = text.getText().toString();
            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("", txt);
            clipboard.setPrimaryClip(clip);
        }
        else
        {
            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("", " ");
            clipboard.setPrimaryClip(clip);
        }
    }

    public void Generated(View view)
    {
        //TextView text = (TextView) findViewById(R.id.textView);
        text = (TextView) findViewById(R.id.textView);
        //EditText editText = (EditText) findViewById(R.id.editTextNumber);
        editText = (EditText) findViewById(R.id.editTextNumber);

        //String txt = editText.getText().toString();
        txt = editText.getText().toString();

        char[] ch = txt.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] < 48 || ch[i] > 57)
            {
                text.setText("Длина пароля должна состоять только из цифр!");
                break;
            }
        }
        //else
        {
            if (txt.isEmpty())
            {
                text.setText("Поле ввода длины пароля пустое!");
            }
            else if(txt.equals("0"))
            {
                text.setText("Длина пароля не может быть нулевой!");
            }
            else
            {
                int length = Integer.parseInt(txt);

                String password = "";
                text.setText("");

                char[] str = ("1234567890abcdefghijklmnoprqstuvwxyzABCDEFGHIJKLMNOPRQSTUVWXYZ%$#@!?&").toCharArray();
                char[] different_register = ("abcdefghijklmnoprqstuvwxyzABCDEFGHIJKLMNOPRQSTUVWXYZ").toCharArray();
                char[] digitals = ("1234567890").toCharArray();
                char[] letters = ("abcdefghijklmnoprqstuvwxyz").toCharArray();
                char[] symbols = ("%$#@!?&").toCharArray();

                char[] digital_letters = ("1234567890abcdefghijklmnoprqstuvwxyz").toCharArray();                                           // 36 символов
                char[] digital_letters_diff_reg = ("1234567890abcdefghijklmnoprqstuvwxyzABCDEFGHIJKLMNOPRQSTUVWXYZ").toCharArray();        // 62 символов
                char[] digital_symbols = ("1234567890%$#@!?&").toCharArray();                                                              // 17 символов
                char[] letters_symbols = ("abcdefghijklmnoprqstuvwxyz%$#@!?&").toCharArray();                                              // 33 символов
                char[] letters_diff_reg_symbols = ("abcdefghijklmnoprqstuvwxyzABCDEFGHIJKLMNOPRQSTUVWXYZ%$#@!?&").toCharArray();           // 59 символов
                char[] digital_letters_symbol = ("123456789abcdefghijklmnoprqstuvwxyz%$#@!?&").toCharArray();

                Switch switchView0 = (Switch) findViewById(R.id.switch0);
                Switch switchView1 = (Switch) findViewById(R.id.switch1);
                Switch switchView2 = (Switch) findViewById(R.id.switch2);
                Switch switchView3 = (Switch) findViewById(R.id.switch3);

                if (switchView0.isChecked() && switchView1.isChecked() && switchView2.isChecked() && switchView3.isChecked())
                {
                    Random random = new Random();
                    //int length = Integer.parseInt(txt);
                    for (int i = 0; i < length; i++)
                    {
                        int x = random.nextInt(69);
                        password += str[x];
                    }
                    text.setText(password);
                }

                if (switchView0.isChecked() && !switchView1.isChecked() && !switchView2.isChecked() && !switchView3.isChecked())
                {
                    Random random = new Random();
                    //int length = Integer.parseInt(txt);
                    for (int i = 0; i < length; i++)
                    {
                        int x = random.nextInt(10);
                        password += digitals[x];
                    }
                    text.setText(password);
                }

                if (!switchView0.isChecked() && switchView1.isChecked() && !switchView2.isChecked() && !switchView3.isChecked())
                {
                    Random random = new Random();
                    //int length = Integer.parseInt(txt);
                    for (int i = 0; i < length; i++)
                    {
                        int x = random.nextInt(26);
                        password += letters[x];
                    }
                    text.setText(password);
                }

                if (!switchView0.isChecked() && switchView1.isChecked() && switchView2.isChecked() && !switchView3.isChecked())
                {
                    Random random = new Random();
                    //int length = Integer.parseInt(txt);
                    for (int i = 0; i < length; i++)
                    {
                        int x = random.nextInt(52);
                        password += different_register[x];
                    }
                    text.setText(password);
                }

                if (!switchView0.isChecked() && !switchView1.isChecked() && !switchView2.isChecked() && switchView3.isChecked())
                {
                    Random random = new Random();
                    //int length = Integer.parseInt(txt);
                    for (int i = 0; i < length; i++)
                    {
                        int x = random.nextInt(7);
                        password += symbols[x];
                    }
                    text.setText(password);
                }

                if (switchView0.isChecked() && switchView1.isChecked() && !switchView2.isChecked() && !switchView3.isChecked())
                {
                    Random random = new Random();
                    //int length = Integer.parseInt(txt);
                    for (int i = 0; i < length; i++)
                    {
                        int x = random.nextInt(36);
                        password += digital_letters[x];
                    }
                    text.setText(password);
                }

                if (switchView0.isChecked() && switchView1.isChecked() && switchView2.isChecked() && !switchView3.isChecked())
                {
                    Random random = new Random();
                    //int length = Integer.parseInt(txt);
                    for (int i = 0; i < length; i++)
                    {
                        int x = random.nextInt(62);
                        password += digital_letters_diff_reg[x];
                    }
                    text.setText(password);
                }

                if (switchView0.isChecked() && !switchView1.isChecked() && !switchView2.isChecked() && switchView3.isChecked())
                {
                    Random random = new Random();
                    //int length = Integer.parseInt(txt);
                    for (int i = 0; i < length; i++)
                    {
                        int x = random.nextInt(17);
                        password += digital_symbols[x];
                    }
                    text.setText(password);
                }

                if (!switchView0.isChecked() && switchView1.isChecked() && !switchView2.isChecked() && switchView3.isChecked())
                {
                    Random random = new Random();
                    //int length = Integer.parseInt(txt);
                    for (int i = 0; i < length; i++)
                    {
                        int x = random.nextInt(33);
                        password += letters_symbols[x];
                    }
                    text.setText(password);
                }

                if (!switchView0.isChecked() && switchView1.isChecked() && switchView2.isChecked() && switchView3.isChecked())
                {
                    Random random = new Random();
                    //int length = Integer.parseInt(txt);
                    for (int i = 0; i < length; i++)
                    {
                        int x = random.nextInt(59);
                        password += letters_diff_reg_symbols[x];
                    }
                    text.setText(password);
                }

                if (switchView0.isChecked() && switchView1.isChecked() && !switchView2.isChecked() && switchView3.isChecked())
                {
                    Random random = new Random();
                    //int length = Integer.parseInt(txt);
                    for (int i = 0; i < length; i++)
                    {
                        int x = random.nextInt(42);
                        password += digital_letters_symbol[x];
                    }
                    text.setText(password);
                }

                if (switchView0.isChecked() && !switchView1.isChecked() && switchView2.isChecked() && switchView3.isChecked())
                {
                    text.setText("Внимание! Уберите галочку с кнопки ''Разный регистр'', поскольку цифры не имеют регистра.");
                }

                if (switchView0.isChecked() && !switchView1.isChecked() && switchView2.isChecked() && !switchView3.isChecked())
                {
                    text.setText("Внимание! Уберите галочку с кнопки ''Разный регистр'', поскольку цифры не имеют регистра.");
                }

                if (!switchView0.isChecked() && !switchView1.isChecked() && switchView2.isChecked() && switchView3.isChecked())
                {
                    text.setText("Внимание! Уберите галочку с кнопки ''Разный регистр'', поскольку специальные символы не имеют регистра.\");");
                }
            }
        }
    }
}
