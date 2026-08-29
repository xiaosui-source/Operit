package com.ai.assistance.operit.core.tools.system

/**
 * 定义工具权限的层级
 * - STANDARD: 基础权限，不需要特殊权限
 * - ACCESSIBILITY: 需要无障碍服务的权限
 * - ADMIN: 需要设备管理员权限
 * - DEBUGGER: 调试和开发用途的权限
 */
enum class AndroidPermissionLevel {
    STANDARD,      // 普通应用权限
    ACCESSIBILITY, // 无障碍服务权限
    DEBUGGER,      // 调试权限
    ADMIN;         // 管理员权限

    companion object {
        /**
         * 从字符串转换为权限等级
         * @param value 权限等级字符串
         * @return 对应的权限等级，如果无法识别则默认为STANDARD
         */
        fun fromString(value: String?): AndroidPermissionLevel {
            return when(value?.uppercase()) {
                "STANDARD" -> STANDARD
                "ACCESSIBILITY" -> ACCESSIBILITY
                "DEBUGGER" -> DEBUGGER
                "ADMIN" -> ADMIN
                else -> STANDARD // 默认为最低权限
            }
        }
    }
} 