package com.example.nint.recyclerview.items

import com.example.nint.recyclerview.adapter.AdapterConstants
import com.example.nint.recyclerview.adapter.ViewType

class Wedding:ViewType {
    override fun getItemViewType(): Int {
        return AdapterConstants.WEDDING
    }

}