public class OtherCompanyException extends RuntimeException {
    public OtherCompanyException(String code) {
        super("他社便です: " + code);
    }
}