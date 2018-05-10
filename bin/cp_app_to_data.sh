#!/system/bin/sh

#setprop persist.cp_data_app 0
CP_CUSTOMER_APP=`getprop persist.cp_data_app`
echo "wanghaizgjwb : CP_CUSTOMER_APP = $CP_CUSTOMER_APP"
if [ 1${CP_CUSTOMER_APP} -ne 11 ];then
    for cp_app in `ls /system/custome_app/`
    do

        if [ -f "/data/app/$cp_app" ]; then
            echo "$cp_app apk has exist in /data/app/"
        else
            echo "$cp_app apk no has exist in /data/app/"    

            if [ -f "/system/custome_app/$cp_app" ]; then    
                cp -R /system/custome_app/$cp_app /data/app/
                chmod 644 /data/app/$cp_app
            fi

        fi
        echo "Install $cp_app to /data/app finished!!"

    done
    setprop persist.cp_data_app 1
fi

