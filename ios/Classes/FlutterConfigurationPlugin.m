#import "FlutterConfigurationPlugin.h"
#import <flutter_configuration/flutter_configuration-Swift.h>

@implementation FlutterConfigurationPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterConfigurationPlugin registerWithRegistrar:registrar];
}
@end
