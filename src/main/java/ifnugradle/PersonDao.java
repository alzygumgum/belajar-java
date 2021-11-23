/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ifnugradle;

/**
 *
 * @author alzygumgum
 */
public interface PersonDao {
    void save (Person p);
    void delete(Person p);
    Person getById(Long id);
}
