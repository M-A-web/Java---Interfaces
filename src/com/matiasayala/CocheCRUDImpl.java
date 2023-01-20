package com.matiasayala;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void findall() {
        System.out.println("findall");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
