// Direct Whatsapp (only)
                Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
                whatsappIntent.setType("text/plain");
                whatsappIntent.setPackage("com.whatsapp");
                whatsappIntent.putExtra(Intent.EXTRA_TEXT, "The text you wanted to share");
                try {
                    getActivity().startActivity(whatsappIntent);
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getActivity(), "Please install whatsapp.", Toast.LENGTH_SHORT).show();

                }


//Share Externelly(anyapp)

Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, "What you want to share");
                startActivity(Intent.createChooser(share, "Share using"));
