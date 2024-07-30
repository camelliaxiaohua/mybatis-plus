/*
*版权所有（c）2011-2024，baomidou（jobob@qq.com）。
*根据Apache许可证，版本2.0（“许可证”）许可；
*除非符合许可证，否则您不得使用此文件。
*您可以在以下处获得许可证的副本
* Http://www.apache.org/licenses/LICENSE-2.0
*除非适用法律要求或书面同意，否则软件
*在“按原样”的基础上分发，
*没有任何明示或暗示的保证或条件。
*有关管理权限的特定语言，请参阅许可证和
*许可证下的限制。
*/
package com.baomidou.mybatisplus.annotation;

import java.lang.annotation.*;

/**
 * 支持普通枚举类字段, 只用在enum类的字段上
 * <p>当实体类的属性是普通枚举，且是其中一个字段，使用该注解来标注枚举类里的那个属性对应字段</p>
 * <p>
 * 使用方式参考 com.baomidou.mybatisplus.test.h2.H2StudentMapperTest
 * <pre>
 * &#64;TableName("student")
 * class Student {
 *     private Integer id;
 *     private String name;
 *     private GradeEnum grade;//数据库grade字段类型为int
 * }
 *
 * public enum GradeEnum {
 *     PRIMARY(1,"小学"),
 *     SECONDORY("2", "中学"),
 *     HIGH(3, "高中");
 *
 *     &#64;EnumValue
 *     private final int code;
 *     private final String descp;
 * }
 * </pre>
 * </p>
 *
 * @author yuxiaobin
 * @date 2018/8/30
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
public @interface EnumValue {

}
