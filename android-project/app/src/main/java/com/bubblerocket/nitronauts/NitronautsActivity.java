package com.bubblerocket.nitronauts;

import org.libsdl.app.SDLActivity;

public class NitronautsActivity extends SDLActivity {
    @Override
    protected String[] getLibraries() {
        return new String[] {
            "SDL2",
            "SDL2_image",
            "SDL2_mixer",
            "SDL2_net",
            "png16",
            "z",
            "Nitronauts"
        };
    }
}