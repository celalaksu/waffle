package com.example.waffle.injection

import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

import com.solana.mobilewalletadapter.clientlib.MobileWalletAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(
    SingletonComponent::class,
    ViewModelComponent::class
)
class WaffleModule {

    @Provides
    fun providesMobileWalletAdapter(): MobileWalletAdapter {
        return MobileWalletAdapter()
    }
}