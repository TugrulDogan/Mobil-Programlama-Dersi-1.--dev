package com.example.mobilprogramlamaodev1;

import android.os.Bundle;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoruEkle {
    private static final String FILE_NAME = "sinav.txt"

    EditText editText;
    private static final Object MODE_PRIVATE = ;
    private FileOutputStream OpenFileOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soruekleme);

        editText = findViewById(R.Id.edit_text)
    }

    public void kaydet(View v){

        String text = editText.getText().toString();
        FileOutputStream fos = null;
        try {
            fos = OpenFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Yüklendi " + getFilesDir() + "/" + FILE_NAME, Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
          catch (IOException e){
            e.printStackTrace();
          } finally {
            if (fos != null){
                fos.close();
            }
        }
    }

    public void yükle(View v){
        FileInputStream fis = null;

        try{
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;
            while ((text = br.readLine()) != null) {
                sb.append(text).append("\n");
            }
            editText.setText(sb.toString());
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        if (fis != null){
            fis.close();
        }

    }



}