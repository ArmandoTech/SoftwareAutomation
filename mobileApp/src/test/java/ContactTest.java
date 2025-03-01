import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void testContactCreationSuccess() {
        Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    void testContactInvalidArguments() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Doe", "1234567890", "123 Main St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("John", null, "1234567890", "123 Main St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("John", "Doe", null, "123 Main St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("John", "Doe", "1234567890", null));
    }
}
