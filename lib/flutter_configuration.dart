import 'dart:async';

import 'package:flutter/services.dart';

class FlutterConfiguration {
  static const MethodChannel _channel =
      const MethodChannel('com.newt/flutter_configuration');

  static Future<String> get language async {
    final String language = await _channel.invokeMethod('getLanguage');
    return language;
  }
}
