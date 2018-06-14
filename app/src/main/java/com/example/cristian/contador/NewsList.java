package com.example.cristian.contador;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by cristian on 11-06-18.
 */

public class NewsList extends Activity {
    TextView textView;
    TextView objView;
    Button button;
    GsonBuilder gsonBuilder = new GsonBuilder();
    Gson gson = gsonBuilder.create();
    News[] news;
    public String url = "http://192.168.0.9:3000/api/v1/news";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_noticias);
        textView = (TextView) findViewById(R.id.news);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                final RequestQueue requestQueue = Volley.newRequestQueue(NewsList.this);
                StringRequest stringRequest = new StringRequest(Request.Method.GET,url,
                        new Response.Listener<String>() {
                            public void onResponse(String response){
                                //textView.setText(response);
                                news= gson.fromJson(response, News[].class);
                                //
                                objView = (TextView) findViewById(R.id.objTxt1);
                                objView.setText("Titulo: "+ news[0].getTitle()+"\n"
                                                + "Fuente: "+news[0].getSource()+"\n"
                                                +"Fecha de Publicacion: "+news[0].getPublished_on()+"\n"
                                                +"Imagen: "+news[0].getSourceImg());
                                new DownloadImageTask((ImageView) findViewById(R.id.imageView1))
                                        .execute(news[0].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt2);
                                objView.setText("Titulo: "+ news[1].getTitle()+"\n"
                                        + "Fuente: "+news[1].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[1].getPublished_on()+"\n"
                                        +"Imagen: "+news[1].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt3);
                                objView.setText("Titulo: "+ news[2].getTitle()+"\n"
                                        + "Fuente: "+news[2].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[2].getPublished_on()+"\n"
                                        +"Imagen: "+news[2].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt4);
                                objView.setText("Titulo: "+ news[3].getTitle()+"\n"
                                        + "Fuente: "+news[3].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[3].getPublished_on()+"\n"
                                        +"Imagen: "+news[3].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt5);
                                objView.setText("Titulo: "+ news[4].getTitle()+"\n"
                                        + "Fuente: "+news[4].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[4].getPublished_on()+"\n"
                                        +"Imagen: "+news[4].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt6);
                                objView.setText("Titulo: "+ news[5].getTitle()+"\n"
                                        + "Fuente: "+news[5].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[5].getPublished_on()+"\n"
                                        +"Imagen: "+news[5].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt7);
                                objView.setText("Titulo: "+ news[6].getTitle()+"\n"
                                        + "Fuente: "+news[6].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[6].getPublished_on()+"\n"
                                        +"Imagen: "+news[6].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt8);
                                objView.setText("Titulo: "+ news[7].getTitle()+"\n"
                                        + "Fuente: "+news[7].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[7].getPublished_on()+"\n"
                                        +"Imagen: "+news[7].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt9);
                                objView.setText("Titulo: "+ news[8].getTitle()+"\n"
                                        + "Fuente: "+news[8].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[8].getPublished_on()+"\n"
                                        +"Imagen: "+news[8].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt10);
                                objView.setText("Titulo: "+ news[9].getTitle()+"\n"
                                        + "Fuente: "+news[9].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[9].getPublished_on()+"\n"
                                        +"Imagen: "+news[9].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt11);
                                objView.setText("Titulo: "+ news[10].getTitle()+"\n"
                                        + "Fuente: "+news[10].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[10].getPublished_on()+"\n"
                                        +"Imagen: "+news[10].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt12);
                                objView.setText("Titulo: "+ news[11].getTitle()+"\n"
                                        + "Fuente: "+news[11].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[11].getPublished_on()+"\n"
                                        +"Imagen: "+news[11].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt13);
                                objView.setText("Titulo: "+ news[12].getTitle()+"\n"
                                        + "Fuente: "+news[12].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[12].getPublished_on()+"\n"
                                        +"Imagen: "+news[12].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt14);
                                objView.setText("Titulo: "+ news[13].getTitle()+"\n"
                                        + "Fuente: "+news[13].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[13].getPublished_on()+"\n"
                                        +"Imagen: "+news[13].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt15);
                                objView.setText("Titulo: "+ news[14].getTitle()+"\n"
                                        + "Fuente: "+news[14].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[14].getPublished_on()+"\n"
                                        +"Imagen: "+news[14].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt16);
                                objView.setText("Titulo: "+ news[15].getTitle()+"\n"
                                        + "Fuente: "+news[15].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[15].getPublished_on()+"\n"
                                        +"Imagen: "+news[15].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt17);
                                objView.setText("Titulo: "+ news[16].getTitle()+"\n"
                                        + "Fuente: "+news[16].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[16].getPublished_on()+"\n"
                                        +"Imagen: "+news[16].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt18);
                                objView.setText("Titulo: "+ news[17].getTitle()+"\n"
                                        + "Fuente: "+news[17].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[17].getPublished_on()+"\n"
                                        +"Imagen: "+news[17].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt19);
                                objView.setText("Titulo: "+ news[18].getTitle()+"\n"
                                        + "Fuente: "+news[18].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[18].getPublished_on()+"\n"
                                        +"Imagen: "+news[18].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt20);
                                objView.setText("Titulo: "+ news[19].getTitle()+"\n"
                                        + "Fuente: "+news[19].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[19].getPublished_on()+"\n"
                                        +"Imagen: "+news[19].getSourceImg());
                                //
                                objView = (TextView) findViewById(R.id.objTxt1);
                                objView.setText("Titulo: "+ news[0].getTitle()+"\n"
                                        + "Fuente: "+news[0].getSource()+"\n"
                                        +"Fecha de Publicacion: "+news[0].getPublished_on()+"\n"
                                        +"Imagen: "+news[0].getSourceImg());
                                requestQueue.stop();
                            }
                        }, new Response.ErrorListener(){
                    public void onErrorResponse(VolleyError error){
                        textView.setText("errorcito");
                        error.printStackTrace();
                        requestQueue.stop();
                    }
                });
                requestQueue.add(stringRequest);

            }
        });

    }
    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}
