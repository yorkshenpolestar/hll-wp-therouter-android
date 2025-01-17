package com.therouter.apt

import javax.lang.model.element.Element

class ServiceProviderItem : Comparable<ServiceProviderItem> {

    var element: Element? = null

    var className = ""

    var returnType = ""

    var methodName = ""

    var params = ArrayList<String>()

    override fun toString(): String {
        return "ServiceProviderItem(element=$element, className='$className', returnType='$returnType', methodName='$methodName', params=$params)"
    }

    override fun compareTo(other: ServiceProviderItem): Int {
        return toString().compareTo(other.toString())
    }
}