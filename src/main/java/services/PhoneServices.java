package services;

import entity.Phone;
import org.hibernate.Session;
import ultil.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhoneServices {
    private static Logger LOGGER = Logger.getLogger(PhoneServices.class.getSimpleName());
    public boolean save(Phone phone){
        LOGGER.log(Level.INFO, String.format("Saving phone with id %s",phone.getId()));
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.save(phone);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            LOGGER.log(Level.INFO, String.format("Error saving phone with id %s",phone.getId(),ex));
            return false;
        }
    }

    public List<Phone> getAll(){
        List<Phone> phoneList = new ArrayList<>();
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            phoneList = (List<Phone>) session.createQuery("from Phone", Phone.class).list();

        }catch (Exception ex){
            LOGGER.log(Level.INFO, "Error getting phone list");
        }
        return phoneList;
    }
}
