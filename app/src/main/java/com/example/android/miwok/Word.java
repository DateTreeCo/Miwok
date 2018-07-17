package com.example.android.miwok;

/**
 * Displays Miwok words and their translations to the user.
 */

public class Word {
    /**
     * Default translation for the word.
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word.
     */
    private String mMiwokTranslation;

    /**
     * Constructs a new Word.
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * @return the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * @return the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}
