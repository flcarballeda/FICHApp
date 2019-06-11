package com.example.appk.controlador;

import android.content.Context;

import com.example.appk.beans.Empresa;

import java.util.List;

public class EmpresaControlador {

    public EmpresaControlador(Context context) {
    }

    public Empresa getEmpresaId(int id_empresa) {
//        bdd.open();
//        Empresa ee = DB.empresaDao.getEmpresaId(id_empresa);
//        bdd.close();
//        return ee;
        return null;
    }

    public List<Empresa> getEmpresas() {
//        bdd.open();
//        List<Empresa> ee = DB.empresaDao.getEmpresas();
//        bdd.close();
//        return ee;
        return null;
    }

    public Empresa primero() {
//        bdd.open();
//        Empresa e = DB.empresaDao.primero();
//        bdd.close();
//        return e;
        return null;
    }

    public Empresa ultimo() {
//        bdd.open();
//        Empresa e = DB.empresaDao.ultimo();
//        bdd.close();
//        return e;
        return null;
    }

    public boolean nuevo(Empresa e) {
//        bdd.open();
//        boolean exito = DB.empresaDao.nuevo(e);
//        bdd.close();
//        return exito;
        return false;
    }

    public boolean eliminar(int id_empresa) {
//        bdd.open();
//        boolean exito = DB.empresaDao.eliminar(id_empresa);
//        bdd.close();
//        return exito;
        return false;
    }

    public boolean actualizar(Empresa e) {
//        bdd.open();
//        boolean exito = DB.empresaDao.actualizar(e);
//        bdd.close();
//        return exito;
        return false;
    }
}
