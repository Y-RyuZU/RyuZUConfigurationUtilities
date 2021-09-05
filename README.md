# Name
RyuZUConfigurationUtilities
 
# Description
私用のSpigot環境でyamlを簡単に書き換えられるようにするLibraryです
 
# Depend
- spigot 1.16.5-R0.1-SNAPSHOT
 
# Usage
1. onEnableでRyuZUConfigurationUtilitiesをJavaPluginを渡してインスタンスを作成してください。
2. yamlをいじるときはConfigurationWrapperをpathをStringで渡し、インスタンスを作成してください
3. インスタンスを作ると、Yamlがある場合はファイルをloadし、ない場合はファイルを新規作成します。
4. ConfigurationWrapperはYamlConfigurationを継承しているのでYamlConfigurationでできることはすべてできます。
 
# Auther
Y_RyuZU 

# License
ほぼ私的なものなのでご自由になんでもどうぞ
