package random.other.types.string;

public class FormatExample {

    private static final String CODE = "Object";
    private static final String EMAIL_TEMPLATE_CODE = "SomeNotification%sEmailTemplate";
    private static final String EXPECTED = "SomeNotification" + CODE + "EmailTemplate";

    public static void main(String[] args) {
        String emailTemplateCode = String.format(EMAIL_TEMPLATE_CODE, CODE);
        System.out.println(emailTemplateCode.equals(EXPECTED) ? "Hell Yeah!" : "Oh, noooo");
    }

}
