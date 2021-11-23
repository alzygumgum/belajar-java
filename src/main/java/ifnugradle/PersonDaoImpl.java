/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifnugradle;

/**
 *
 * @author alzygumgum
 */
public class PersonDaoImpl implements PersonDao{
    public void save(Person p){
        System.out.println("menyimpan Person");
    }
    public void delete(Person p){
        System.out.println("menghapus Person");
    }
    public Person getById(Long id){
        Person p = new Person();
        p.setId(id);
        p.setNama("abc");
        return p;
    }
}
