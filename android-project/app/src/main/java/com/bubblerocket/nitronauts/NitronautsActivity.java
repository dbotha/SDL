package com.bubblerocket.nitronauts;

import org.libsdl.app.SDLActivity;

public class NitronautsActivity extends SDLActivity {
    @Override
    protected String[] getLibraries() {
        return new String[] {
            "Nitronauts"
        };
    }
}