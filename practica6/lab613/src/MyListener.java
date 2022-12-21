public class MyListener implements OnStringBuilderChangeListener {
    public MyListener() {
    }

    public void onChange(OvservableStringBuilder stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}
