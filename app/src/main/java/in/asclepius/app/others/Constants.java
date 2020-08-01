package in.asclepius.app.others;


import org.jetbrains.annotations.NotNull;

public class Constants {

    public static String USER_DATABASE_REFERENCE="app_users";
    public static String USER_MEMBERS_REFERENCE="app_user_members";

    public static final String INTENT_KEY_FULL_NAME="full_name";
    @NotNull
    public static final String INTENT_KEY_MOBILE_PHONE="mobileNumber";

    public static String[] relations=new String[]{"wife","son","daughter",
            "father","mother","sister","brother","grand mother","grand father", "great grandmother","grand son","grand daughter",
            "uncle","aunt","nephew","niece","cousin","step father","step mother","step brother",
            "step son","step daughter","father in law",
            "mother in law","brother in law","sister in law","son in law","daughter in law","Some Other Relation"};
}