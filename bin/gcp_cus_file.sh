#!/system/bin/sh

Src_presentation_file=/system/media/presentation_file
Dst_presentation_file=/storage/emulated/legacy
Cp_flag=`getprop  persist.wh.custom`
wait_time=0
while true
do
    sleep 1
    ((wait_time++))
    if [ -e "$Dst_presentation_file" ]; then

        if [ x$Cp_flag == x ]; then

            cp -rf $Src_presentation_file/*   $Dst_presentation_file/
            echo "cp -rf $Src_presentation_file/*   $Dst_presentation_file/"
            sleep 1
            setprop persist.wh.custom has_cp
            echo "persist.wh.custom = [$Cp_flag]"
        else
            echo "custemer presentation file has exits !!"
        fi

        setprop persist.wh.custom_time $wait_time
        break
    else
        echo "$Dst_presentation_file not exit!!"
    fi

done

