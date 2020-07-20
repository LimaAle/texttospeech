package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import bz.rxla.flutter.speechrecognition.SpeechRecognitionPlugin;
import com.csdcorp.speech_to_text.SpeechToTextPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    SpeechRecognitionPlugin.registerWith(registry.registrarFor("bz.rxla.flutter.speechrecognition.SpeechRecognitionPlugin"));
    SpeechToTextPlugin.registerWith(registry.registrarFor("com.csdcorp.speech_to_text.SpeechToTextPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
