package ie.wit.donationx.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ie.wit.donationx.R
import ie.wit.donationx.databinding.FragmentAboutBinding
import ie.wit.donationx.main.DonationXApp


class AboutFragment : Fragment() {

    lateinit var app: DonationXApp
    private var _fragBinding: FragmentAboutBinding? = null
    private val fragBinding get() = _fragBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        app = activity?.application as DonationXApp
        setHasOptionsMenu(true)
        //navController = Navigation.findNavController(activity!!, R.id.nav_host_fragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _fragBinding = FragmentAboutBinding.inflate(inflater, container, false)
        val root = fragBinding.root

        fragBinding.imageView

        //fragBinding.recyclerView.setLayoutManager(LinearLayoutManager(activity))


        return root
    }


}