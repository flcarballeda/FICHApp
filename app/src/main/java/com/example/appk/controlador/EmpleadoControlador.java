package com.example.appk.controlador;

import android.content.Context;

import com.example.appk.beans.Empleado;

import java.util.List;

public class EmpleadoControlador {
    public EmpleadoControlador(Context context) {
    }

    public Empleado getEmpleadoId(int id_empleado) {
//        bdd.open();
//        Empleado ee = DB.empleadoDao.getEmpleadoId(id_empleado);
//        bdd.close();
//        return ee;
        return null;
    }

    public List<Empleado> getEmpleados() {
//        bdd.open();
//        List<Empleado> ee = DB.empleadoDao.getEmpleados();
//        bdd.close();
//        return ee;
        return null;
    }

    public Empleado primero() {
//        bdd.open();
//        Empleado e = DB.empleadoDao.primero();
//        bdd.close();
//        return e;
        return null;
    }

    public Empleado ultimo() {
//        bdd.open();
//        Empleado e = DB.empleadoDao.ultimo();
//        bdd.close();
//        return e;
        return null;
    }

    public List<String> getRoles() {
//        bdd.open();
//        List<String> roles = DB.empleadoDao.getRoles();
//        bdd.close();
//        return roles;
        return null;
    }

    public Empleado getEmpleadoUsuarioClave(String usuario, String clave) {
//        bdd.open();
//        Empleado e = DB.empleadoDao.getEmpleadoUsuarioClave(usuario, clave);
//        bdd.close();
//        return e;
        return null;
    }

    public boolean nuevo(Empleado e) {
//        bdd.open();
//        boolean exito = DB.empleadoDao.nuevo(e);
//        bdd.close();
//        return exito;
        return false;
    }

    public boolean eliminar(int id_empleado) {
//        bdd.open();
//        boolean exito = DB.empleadoDao.eliminar(id_empleado);
//        bdd.close();
//        return exito;
        return false;
    }

    public boolean actualizar(Empleado e) {
//        bdd.open();
//        boolean exito = DB.empleadoDao.actualizar(e);
//        bdd.close();
//        return exito;
        return false;
    }

    public boolean baja(Empleado e) {
//        bdd.open();
//        boolean exito = DB.empleadoDao.baja(e);
//        bdd.close();
//        return exito;
        return false;
    }
}
