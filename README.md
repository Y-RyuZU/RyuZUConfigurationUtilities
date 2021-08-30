# Name
RyuZUConfigurationUtilities
 
# Description
私用のSpigot環境でyamlを簡単に書き換えられるようにするLibraryです
 
# Depend
- spigot 1.16.5-R0.1-SNAPSHOT
 
# Usage
onEnableでRyuZUConfigurationUtilitiesをJavaPluginを渡してインスタンスを作成してください。
yamlをいじるときはConfigurationWrapperをpathをStringで渡し、インスタンスを作成してください
インスタンスを作ると、Yamlがある場合はファイルをloadし、ない場合はファイルを新規作成します。
ConfigurationWrapperはYamlConfigurationを継承しているのでYamlConfigurationでできることはすべてできます。
 
# Auther
Y_RyuZU 

# License
ほぼ私的なものなのでご自由になんでもどうぞ
