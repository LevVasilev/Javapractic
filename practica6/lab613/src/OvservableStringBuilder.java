public class OvservableStringBuilder {
    private OnStringBuilderChangeListener onChangeListener;
    private StringBuilder stringBuilder = new StringBuilder();

    public void setOnChangeListener(OnStringBuilderChangeListener onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    public OvservableStringBuilder() {
    }

    private void notifyOnStringBuilderChangeListener() {
        if (this.onChangeListener != null) {
            this.onChangeListener.onChange(this);
        }

    }

    public OvservableStringBuilder append(Object obj) {
        this.stringBuilder.append(obj);
        this.notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder replace(int start, int end, String str) {
        this.stringBuilder.replace(start, end, str);
        this.notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableStringBuilder insert(int index, char[] str, int offset, int len) {
        this.stringBuilder.insert(index, str, offset, len);
        this.notifyOnStringBuilderChangeListener();
        return this;
    }

    public String toString() {
        return this.stringBuilder.toString();
    }
}
