package enums;


public enum Category {
    A("General Works"),
    B("Philosophy, Psychology, Religion"),
    C("Auxiliary Sciences of History"),
    D("World History and History of Europe, Asia, Africa, Australia, New Zealand, etc."),
    E("History of the Americas"),
    F("History of the United States and British North America"),
    G("Geography, Anthropology, Recreation"),
    H("Social Sciences"),
    J("Political Science"),
    K("Law"),
    L("Education"),
    M("Music"),
    N("Fine Arts"),
    P("Language and Literature"),
    Q("Science"),
    R("Medicine"),
    S("Agriculture"),
    T("Technology"),
    U("Military Science"),
    V("Naval Science"),
    Z("Bibliography, Library Science, Information Resources");

    private final String description;

    // Constructor
    Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // Bir alt sınıfın hangi kategoriye denk geldiğini göstermek için.
    public static Category getCategoryForItem(String itemType) {
        switch (itemType.toLowerCase()) {
            case "audiobooks":
                return M;  // Audiobooks genellikle Music kategorisine denk gelir.
            case "ebooks":
                return P;  // E-books Language and Literature (P) altında yer alabilir.
            case "magazines":
            case "newspapers":
                return H;  // Magazines ve Newspapers Social Sciences (H) altında yer alabilir.
            case "dvds":
            case "blu-rays":
                return N;  // DVDs ve Blu-rays Fine Arts (N) altına denk gelebilir.
            case "music cds":
                return M;  // Music CDs Music (M) kategorisine denk gelir.
            case "video games":
                return G;  // Video Games Recreation altında yer alabilir.
            case "reference materials":
                return Z;  // Reference Materials genellikle Bibliography (Z) altına girer.
            case "online databases":
                return Z;  // Online Databases genellikle Information Resources (Z) altına girer.
            default:
                return A;  // Genel bir durum için General Works (A).
        }
    }
}

