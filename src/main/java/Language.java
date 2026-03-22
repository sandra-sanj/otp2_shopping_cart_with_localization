public class Language {
    private String language;
    private String country;
    private String locale;

    public Language(String language, String country) {
        this.language = language;
        this.country = country;
        this.locale = String.format("%s_%s", this.language, this.country);
    }

    public String getLocale() {
        return locale;
    }
}
