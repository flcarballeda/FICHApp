package edu.cftic.fichapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.appk.beans.Empresa;
import com.example.appk.controlador.EmpleadoControlador;
import com.example.appk.controlador.EmpresaControlador;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // TODO hay que definir esta cadena para que sea
    //         utilizada en toda la aplicación.
    public static final String GESTOR = "gestor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Comprobar si hay un empleado que sea el Responsable
        EmpleadoControlador empleadoControlador = new EmpleadoControlador( this);
        List<String> roles = empleadoControlador.getRoles();

        Intent intent = null;
        if( null == roles || roles.contains(GESTOR)) {
            // No hay empleados registrados o ninguno de los
            //    empleados registrados es un gestor.
            // TODO Llamar a la Actividad de dar de alta Empleados,
            //        forzando que sea un gestor o responsable.
//            intent = new Intent(this, RegistroEmpleadoActivity.class);

            // Para informar que hay que forzar que el alta sea
            //    de un gestor se pasa un Boolean de valor True
            //    en el Intent. El nombre del Extra está definido
            //    en la Actividad que recibe el Dato.
//            intent.putExtra( RegistroEmpleadoActivity., true);

        } else {
            // Ya hay empleados y hay, al menos, un GESTOR.

            // Comprobar si hay dada de alta al menos una Empresa
            EmpresaControlador empresaControlador = new EmpresaControlador(this);
            Empresa empresa = empresaControlador.primero();
            if( null == empresa) {
                // No hay empresas en la Base de datos, hay que dar de alta.
                // TODO Llamar a la Actividad de dar de alta Empresas.
//                intent = new Intent(this, RegistroEmpresaActivity.class);
            } else {
                // TODO Saltar al Login.
//                intent = new Intent( this, .class);
            }
        }
        if( null != intent) {
            startActivity( intent);
        }
    }
}
