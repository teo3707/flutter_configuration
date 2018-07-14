package com.newt.flutterconfiguration

import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.PluginRegistry.Registrar
import java.util.Locale

class FlutterConfigurationPlugin(): MethodCallHandler {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar): Unit {
      val channel = MethodChannel(registrar.messenger(), "com.newt/flutter_configuration")
      channel.setMethodCallHandler(FlutterConfigurationPlugin())
    }
  }

  override fun onMethodCall(call: MethodCall, result: Result): Unit {
    when (call.method) {
      "getLanguage" -> result.success(Locale.getDefault().language)
      else -> result.notImplemented()
    }
  }
}
