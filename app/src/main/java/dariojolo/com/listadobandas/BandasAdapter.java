package dariojolo.com.listadobandas;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by rodrigrl on 15/10/2015.
 */
public class BandasAdapter extends ArrayAdapter<Bandas> {

    Context context;
    int LayoutResource;
    Bandas [] datos = null;
    public BandasAdapter(Context context, int LayoutResource, Bandas [] datos) {
        super(context, LayoutResource, datos);

        this.context = context;
        this.LayoutResource = LayoutResource;
        this.datos = datos;
    }

    public View getView(int posicion,View converView,ViewGroup parent){
        View row = converView;
        BandasHolder holder = null;

        if (row == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(LayoutResource,parent,false);
            holder = new BandasHolder();
            holder.imagen = (ImageView)row.findViewById(R.id.imageView);
            holder.texto = (TextView)row.findViewById(R.id.textView);
            row.setTag(holder);
        }else{
            holder = (BandasHolder)row.getTag();
        }

        Bandas bandas = datos[posicion];
        holder.texto.setText(bandas.nombre);
        holder.imagen.setImageResource(bandas.imagen);

        return row;
    }


    static class BandasHolder{
        ImageView imagen;
        TextView texto;
    }
}
