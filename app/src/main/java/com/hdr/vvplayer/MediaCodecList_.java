package com.hdr.vvplayer;

/**
 * @Author Huangdaran
 * @Date 2023/11/8 23:44
 * @Description
 */
public class MediaCodecList_ {
}
//#include "MediaCodecList.h"
//        typedef struct J4AC_android_media_MediaCodecList {
//        jclass mediaCodecList_id;
//        jclass mediaCodecInfo_id;
//
//        jmethodID method_getCodecCount;
//        jmethodID method_getCodecInfoAt;
//        jmethodID method_isEncoder;
//        jmethodID method_getName;
//
//        jmethodID method_getSupportedTypes;
//        } J4AC_android_media_MediaCodecList;
//static J4AC_android_media_MediaCodecList class_J4AC_android_media_MediaCodecList;
//
//
//        const char * J4AC_android_media_MediaCodecList_getCodecName(JNIEnv *env,const char* mime){
//
//        const char* code_name = NULL;
//        jstring j_mime = (*env)->GetStringUTFChars(env,mime);
//
//        jint coiunt = (*env)->CallStaticIntMethod(env,class_J4AC_android_media_MediaCodecList.mediaCodecList_id,class_J4AC_android_media_MediaCodecList.method_getCodecCount);
//
//        for (int i = 0; i < coiunt; ++i)
//        {
//        jobject mediaCodecInfo_obj = (*env)->CallStaticObjectMethod(env,class_J4AC_android_media_MediaCodecList.mediaCodecList_id,class_J4AC_android_media_MediaCodecList.method_getCodecInfoAt,i);
//
//        jboolean isEnCode = (*env)->CallBooleanMethod(env,mediaCodecInfo_obj,class_J4AC_android_media_MediaCodecList.method_isEncoder);
//        if (!(bool)isEnCode)
//        {
//        jstring name = (jstring)(*env)->CallObjectMethod(env,mediaCodecInfo_obj,class_J4AC_android_media_MediaCodecList.method_getName);
//        jobjectArray typesArr= (*env)->CallObjectMethod(env,mediaCodecInfo_obj,class_J4AC_android_media_MediaCodecList.method_getSupportedTypes);
//        jsize size = (*env)->GetArrayLength(env,typesArr);
//        for(int i=0;i<size;i++)
//        {
//        jstring type = (jstring)(*env)->GetObjectArrayElement(env,typesArr,i);
//        if (type == j_mime){
//
//
//
//        }
//
//        }
//        }
//        }
//        return NULL;
//
//        }
//
//        int J4A_loadClass__J4AC_android_media_MediaCodecList(JNIEnv *env)
//        {
//        int         ret                   = -1;
//        const char *J4A_UNUSED(name)      = NULL;
//        const char *J4A_UNUSED(sign)      = NULL;
//        jclass      J4A_UNUSED(class_id)  = NULL;
//
//        if (class_J4AC_android_media_MediaCodecList.mediaCodecList_id != NULL)
//        return 0;
//
//        sign = "android/media/MediaCodecList";
//        class_J4AC_android_media_MediaCodecList.mediaCodecList_id = J4A_FindClass__asGlobalRef__catchAll(env, sign);
//        if (class_J4AC_android_media_MediaCodecList.mediaCodecList_id == NULL)
//        goto fail;
//
//        sign = "android/media/MediaCodecInfo";
//        class_J4AC_android_media_MediaCodecList.mediaCodecInfo_id = J4A_FindClass__asGlobalRef__catchAll(env, sign);
//        if (class_J4AC_android_media_MediaCodecList.mediaCodecInfo_id == NULL)
//        goto fail;
//
//
//
//        class_id = class_J4AC_android_media_MediaCodecList.mediaCodecList_id;
//        name     = "getCodecCount";
//        sign     = "()I";
//
//        class_J4AC_android_media_MediaCodecList.method_getCodecCount = J4A_GetStaticMethodID__catchAll(env, class_id, name, sign);
//        if (class_J4AC_android_media_MediaCodecList.method_getCodecCount == NULL)
//        goto fail;
//
//
//        class_id = class_J4AC_android_media_MediaCodecList.mediaCodecList_id;
//        name     = "getCodecInfoAt";
//        sign     = "(I)Landroid/media/MediaCodecInfo;";
//
//        class_J4AC_android_media_MediaCodecList.method_getCodecInfoAt = J4A_GetStaticMethodID__catchAll(env, class_id, name, sign);
//        if (class_J4AC_android_media_MediaCodecList.method_getCodecInfoAt == NULL)
//        goto fail;
//
//
//        class_id = class_J4AC_android_media_MediaCodecList.mediaCodecInfo_id;
//        name     = "isEncoder";
//        sign     = "()Z";
//        class_J4AC_android_media_MediaCodecList.method_isEncoder = J4A_GetMethodID__catchAll(env, class_id, name, sign);
//        if (class_J4AC_android_media_MediaCodecList.method_isEncoder == NULL)
//        goto fail;
//
//        class_id = class_J4AC_android_media_MediaCodecList.mediaCodecInfo_id;
//        name     = "getName";
//        sign     = "()Ljava/lang/String;";
//        class_J4AC_android_media_MediaCodecList.method_getName = J4A_GetMethodID__catchAll(env, class_id, name, sign);
//        if (class_J4AC_android_media_MediaCodecList.method_getName == NULL)
//        goto fail;
//
//
//        class_id = class_J4AC_android_media_MediaCodecList.mediaCodecInfo_id;
//        name     = "getSupportedTypes";
//        sign     = "()[Ljava/lang/String;";
//        class_J4AC_android_media_MediaCodecList.method_getSupportedTypes = J4A_GetMethodID__catchAll(env, class_id, name, sign);
//
//        if (class_J4AC_android_media_MediaCodecList.method_getSupportedTypes == NULL)
//        goto fail;
//
//        J4A_ALOGD("J4ALoader: OK: '%s' loaded\n", "android.media.MediaCodecList");
//// ignore:
////     ret = 0;
//        fail:
//        return ret;
//        }
