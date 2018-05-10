echo ondemand > /sys/devices/system/cpu/cpu0/cpufreq/scaling_governor
echo 1 > /sys/devices/system/cpu/cpufreq/ondemand/sampling_down_factor
echo 50000 > /sys/devices/system/cpu/cpufreq/ondemand/sampling_rate
echo 97 > /sys/devices/system/cpu/cpufreq/ondemand/up_threshold