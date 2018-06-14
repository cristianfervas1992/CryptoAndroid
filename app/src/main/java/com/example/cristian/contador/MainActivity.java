package com.example.cristian.contador;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends Activity {
    public int contador;
    Button button;
    TextView textView;
    TextView largo;
    public String url = "http://192.168.0.9:3000/api/v1/news";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador=0;
        button = (Button) findViewById(R.id.seeNews);
        //textView = (TextView) findViewById(R.id.news);
        /*button.setOnClickListener(new View.OnClickListener(){
            public void onClick(final View v){
                mostrarListadoNoticias(v);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                final RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                StringRequest stringRequest = new StringRequest(Request.Method.GET,url,
                        new Response.Listener<String>() {
                            public void onResponse(String response){
                                //textView.setText(response);
                                GsonBuilder gsonBuilder = new GsonBuilder();
                                Gson gson = gsonBuilder.create();
                                News[] news= gson.fromJson(response, News[].class);
                                requestQueue.stop();
                                mostrarListadoNoticias(v, news);


                            }
      //                  }, new Response.ErrorListener(){
                    public void onErrorResponse(VolleyError error){
                        textView.setText("errorcito");
                        error.printStackTrace();
                        requestQueue.stop();
                    }
                });
                requestQueue.add(stringRequest);

            }
        });
    */

    }
    public void mostrarListadoNoticias(View view){
        Intent intent = new Intent(this,NewsList.class);
        //intent.putExtra("largo",news.length);
        //Gson gson = new Gson();
        //largo = (TextView) findViewById(R.id.largo);
        //String muestra = Integer.toString(news.length);
        //largo.setText(muestra);
        /*for(int i=0;i<news.length;i++){
            String newsAsString = gson.toJson(news[i]);
            intent.putExtra("noticia",newsAsString);
        }*/
        //Bundle args = new Bundle();
        //args.putSerializable("Noticias",(Serializable) news);
        //intent.putExtra("Bundle",args);
        startActivity(intent);

    }
    /*Cada metodo recibe la vista
    public void addContador(View view){
        contador++;
        result();
    }
    public void subContador(View view){
        contador--;
        result();
    }
    public void resetContador(View view){
        contador=0;
        result();
    }
    public void result(){
        // Aqui se carga la vista actual, R posee todos los recursos
        //Por ende desde aqui se puede acceder a los ids
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(""+ contador);
    }
       */



}
