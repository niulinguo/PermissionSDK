package com.niles.permission;

import permissions.dispatcher.PermissionRequest;

/**
 * Created by Niles
 * Date 2018/12/7 13:38
 * Email niulinguo@163.com
 */
//@RuntimePermissions
public interface IStoragePermission {

    /**
     * 请求存储权限
     * 如果已经有存储权限，直接调用 {@link #onStorageRequested()}
     */
    void requestStorage();

    /**
     * 存储权限请求成功
     */
//    @NeedsPermission(value = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"})
    void onStorageRequested();

    /**
     * 请求前弹窗提示
     */
//    @OnShowRationale(value = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"})
    void showRationaleForStorage(PermissionRequest request);

    /**
     * 用户拒绝权限
     */
//    @OnPermissionDenied(value = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"})
    void showPermissionDeniedForStorage();

    /**
     * 用户选择了不再提示
     */
//    @OnNeverAskAgain(value = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"})
    void showNeverAskAgainForStorage();
}
