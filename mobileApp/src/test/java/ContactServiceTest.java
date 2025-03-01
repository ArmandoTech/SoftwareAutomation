import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    @Test
    void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);

        assertEquals(contact, service.getContact("1234567890"));
    }

    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);

        service.deleteContact("1234567890");
        assertNull(service.getContact("1234567890"));
    }

    @Test
    void testUpdateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);

        service.updateContact("1234567890","Jane", "Smith", "0987654321", "456 Elm St");

        assertEquals("Jane", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("0987654321", contact.getPhone());
        assertEquals("456 Elm St", contact.getAddress());
    }
}
