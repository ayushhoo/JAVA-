// Section: Creating Custom Annotations
// Question: Create a custom annotation @JsonField to specify field names for JSON serialization.
Question: Create a custom annotation @JsonField to specify field names for JSON serialization.
Answer:
@JsonField can be used to indicate the JSON field name for a class field. It can have a value() for the field name. It can also optionally include a type() for the JSON type, but the basic example uses only the field name.

Example:
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String value();
}

class JsonExample {
    @JsonField(value = "fullName")
    private String name;

    @JsonField(value = "accountBalance")
    private double balance;

    public void printFields() {
        for (Field field : JsonExample.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField ann = field.getAnnotation(JsonField.class);
                try {
                    field.setAccessible(true);
                    Object value = field.get(this);
                    System.out.println(ann.value() + ": " + value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        JsonExample obj = new JsonExample();
        obj.name = "John Doe";
        obj.balance = 1000.0;
        obj.printFields();
    }
}